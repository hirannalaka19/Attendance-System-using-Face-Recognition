
package NN;

import java.lang.*;
import java.io.*;
import java.util.Random;

public class NeuralNetwork {

	int n1, n2, n3, Cycle;
	double LearningRate, Momentum, Epsilon;
	double w1[][], delta1[][], out1[];
	double w2[][], delta2[][], in2[], out2[], theta2[];
	double in3[], out3[], theta3[];
	double Expected[];
	Random generator;
	
	BufferedInputStream fileinput;
	
	public int RandomInt(int n){
		return generator.nextInt(n);
	}
	
	public NeuralNetwork(int input_layer, int hidden_layer, int output_layer){
		int i, j, v;
		
		generator = new Random();
		
		n1 = input_layer;
		n2 = hidden_layer;
		n3 = output_layer;
		
		Momentum = 0.9;
		Cycle = 300;
		LearningRate = 0.001;
		Epsilon = 0.0001;
		
		w1 = new double [ n1 + 1 ][ n2 + 1 ];
		delta1 = new double [ n1 + 1 ][ n2 + 1 ];
		
		w2 = new double [ n2 + 1 ][ n3 + 1 ];
		delta2 = new double [ n2 + 1 ][ n3 + 1 ];
		
		out1 = new double [ n1 + 1 ];
		
		in2 = new double [ n2 + 1 ];
		out2 = new double [ n2 + 1 ];
		theta2 = new double [ n2 + 1 ];
		
		in3 = new double [ n3 + 1 ];
		out3 = new double [ n3 + 1 ];
		theta3 = new double [ n3 + 1 ];
		
		Expected = new double [ n3 + 1 ];
		
		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ ){
				v = RandomInt(2);
				//w1[i][j] = (double)( RandomInt(6) ) / 10;
				w1[i][j] = (double)( RandomInt(10) ) / ( 10 * n2 );
				if ( v == 1 ) w1[i][j] = - w1[i][j];
        }
		
		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ ){
				v = RandomInt(2);
				w2[i][j] = (double)( RandomInt(10) ) / ( 10 * n3 );
				if ( v == 1 ) w2[i][j] = - w2[i][j];
			}
	}	
	
	public double read() throws IOException{
		int v;
		char ch;
		String s = "";
		
		while (true){
			v=fileinput.read();
			ch=(char)(v);
			if (ch!=' '){
				s+=ch;
				break;
			}
		}
		
		while (true){
			v=fileinput.read();
			if (v==-1) break;
			ch=(char)(v);
			if (ch==' ') break;
			s+=ch;
		}
		
		return Double.parseDouble(s);
	}
	
	public void SetCost(String filename) throws IOException{
		int i, j;
		
		fileinput = new BufferedInputStream ( new FileInputStream(filename) );
		
		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ ) w1[i][j] = read();
		
		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ ) w2[i][j] = read();
			
		fileinput.close();
	}
	
	public void SetMomentum( double value ){
		Momentum = value;
	}
	
	public double GetMomentum(){
		return Momentum;
	}
	
	public void SetCycle( int value ){
		Cycle = value;
	}
	
	public int SetCycle(){
		return Cycle;
	}
	
	public void SetLearningRate( double value ){
		LearningRate = value;
	}
	
	public double GetLearningRate(){
		return LearningRate;
	}
	
	public void SetEpsilon( double value ){
		Epsilon = value;
	}
	
	public double GetEpsilon(){
		return Epsilon;
	}

	public void WriteCost(String filename) throws IOException{
		int i, j;
		
		FileWriter fileoutput = new FileWriter(filename);
        PrintWriter writer = new PrintWriter(fileoutput);
		
		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ ) writer.print(w1[i][j]+" ");
		
		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ ) writer.print(w2[i][j]+" ");
			
		writer.close();
	}
	
	public double Sigmoid( double x ){
		return (double)(1) / ( 1 + Math.exp(-x) );
	}

	public void Perceptron(){
		int i, j;
	
		for ( i = 1 ; i <= n2 ; i++ ) in2[i] = 0;
	
		for ( i =1 ; i <= n3 ; i++ ) in3[i] = 0;
	
		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ )
				in2[j] += out1[i] * w1[i][j];
			
		for ( i = 1 ; i <= n2 ; i++ ) out2[i] = Sigmoid ( in2[i] );
	
		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ )
				in3[j] += out2[i] * w2[i][j];
			
		for ( i = 1 ; i <= n3 ; i++ ) out3[i] = Sigmoid ( in3[i] );
	}

	public double SquareError(){
		int i;
		double res = 0;
		for ( i = 1 ; i <= n3 ; i++ )
			res += ( out3[i] - Expected[i] ) * ( out3[i] - Expected[i] );
		res /= 2;
		return res;
	}
	
	public double CalculateError(double Expected[]){
		int i;
		double res = 0;
		for ( i = 1 ; i <= n3 ; i++ )
			res += ( out3[i] - Expected[i-1] ) * ( out3[i] - Expected[i-1] );
		res /= 2;
		return res;
	}

	public void BackPropagation(){
		int i , j;
		double sum;

		for ( i = 1 ; i <= n3 ; i++ )
			theta3[i] = out3[i] * ( 1 - out3[i] ) * ( Expected[i] - out3[i] );

		for ( i = 1 ; i <= n2 ; i++ ){
			sum=0;
			for ( j = 1 ; j <= n3 ; j++ )
				sum += w2[i][j] * theta3[j];
			theta2[i] = out2[i] * ( 1 - out2[i] ) * sum;
		}

		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ ){
				delta2[i][j] = ( LearningRate * theta3[j] * out2[i] ) + ( Momentum * delta2[i][j] );
				w2[i][j] += delta2[i][j];
			}

		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ ){
				delta1[i][j] = ( LearningRate * theta2[j] * out1[i] ) + ( Momentum * delta1[i][j] );
				w1[i][j] += delta1[i][j];
			}	
	}

	public void Study(double input[], double output[]){
		int i, j;
		
		for ( i = 0 ; i < n1 ; i++ ) out1[ i + 1 ] = input[i];
		
		for ( i = 0 ; i < n3 ; i++ ) Expected[ i + 1 ] = output[i];
		
		for ( i = 1 ; i <= n1 ; i++ )
			for ( j = 1 ; j <= n2 ; j++ ) delta1[i][j] = 0;

		for ( i = 1 ; i <= n2 ; i++ )
			for ( j = 1 ; j <= n3 ; j++ ) delta2[i][j] = 0;

		for ( i = 1 ; i <= Cycle ; i++ ){
			Perceptron();
			BackPropagation();
			if (SquareError()<Epsilon) break;
		}
	}
	
	public void Classification(double input[], double output[]){
		int i;
		
		for ( i = 0 ; i < n1 ; i++ ) out1[ i + 1 ] = input[i];
		
		Perceptron();
		
		for ( i = 0 ; i < n3 ; i++ ) output[i] = out3[ i + 1 ];
	}

}
