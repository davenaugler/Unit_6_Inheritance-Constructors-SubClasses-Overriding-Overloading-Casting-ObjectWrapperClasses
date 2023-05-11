package com.coderscampus.lesson1;

public class Lessson1Application {

	public static void main(String[] args) {
		Teacher physicsTeacher = new PhysicsTeacher();
		System.out.println("Physics Teacher:");
		System.out.println("Required Classes: " + physicsTeacher.getClasses());
		System.out.println("Required LOE: " + physicsTeacher.getLevelOfEducation());
		physicsTeacher.teach("Mary", 15);
		System.out.println("------");
		
		
		Teacher compSciTeacher = new CompSciTeacher();
		System.out.println("CompSci Teacher:");
		System.out.println("Required Classes: " + compSciTeacher.getClasses());
		System.out.println("Required LOE: " + compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach("Dave", "BSU", 21);
		System.out.println("------");
		
		Teacher quantumPhysicsTeacher = new QuantumPhysicsTeacher();
		System.out.println("QuantumPhysicsTeacher:");
		System.out.println("Required Classes: " + quantumPhysicsTeacher.getClasses());
		System.out.println("Required LOE: " + quantumPhysicsTeacher.getLevelOfEducation());
		quantumPhysicsTeacher.teach();
		System.out.println("------");

		
		
		
	}

}
