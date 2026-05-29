package com.jdc.mkt.exe;

public class Main {

	public static void main(String[] args) {

		Educator<Professor> prof = new Educator<>(new Professor());
		Educator<Teacher> teacher = new Educator<>(new Teacher());

		doWork(prof);
		doWork(teacher);
	}

	static void doWork(Educator<?> educator) {
		educator.doWork();
	}
}

interface Job {
	void doJob();
}

class Educator<T extends Job> {
	private T job;

	public Educator(T job) {
		this.job = job;
	}

	void doWork() {
		job.doJob();
	}
}

class Professor implements Job {

	@Override
	public void doJob() {
		System.out.println("researching");
	}

}

class Teacher implements Job {

	@Override
	public void doJob() {
		System.out.println("teaching");
	}

}
