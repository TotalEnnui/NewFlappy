package com.thecherno.flappy.math;

public class Matrix4f {
	
	public float[] matrix = new float[4 * 4];
	
	public static Matrix4f identity() {
		Matrix4f result = new Matrix4f();
		
		for(int i = 0; i < 4; i++) {
			result.matrix[i] = 0.0f;		
		}
		
		result.matrix[0 + 0 * 4] = 1.0f;
		result.matrix[1 + 1 * 4] = 1.0f;
		result.matrix[2 + 2 * 4] = 1.0f;
		result.matrix[3 + 3 * 4] = 1.0f;
	}
	
	public Matrix4f multiply(Matrix4f matrix) {
		Matrix4f result = new Matrix4f();
		
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; )
		}
		
		return result;
	}

}