package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.vector_crud_operation.VectorCrudOperation;

public class MainDriver
{
	static VectorCrudOperation vectorCrudOperation = new VectorCrudOperation();
	public static void main(String[] args)
	{
		vectorCrudOperation.createTheData();
		
		vectorCrudOperation.readTheData();
		
		vectorCrudOperation.updateTheData();
		
		vectorCrudOperation.deleteTheData();
	}
}