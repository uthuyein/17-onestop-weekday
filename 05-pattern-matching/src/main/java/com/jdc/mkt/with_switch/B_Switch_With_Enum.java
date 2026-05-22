package com.jdc.mkt.with_switch;

import com.jdc.mkt.EmployeeStatus;
import com.jdc.mkt.MemberStatus;
import com.jdc.mkt.StudentStatus;

public class B_Switch_With_Enum {

	public static void main(String[] args) {
		String result = withMixingEnum(EmployeeStatus.Provation);
		System.out.println(result);
	}
	
	static String withMixingEnum(MemberStatus status) {
		return switch(status) {
			case StudentStatus.Applied,
				 StudentStatus.Approved ,
				 StudentStatus.Finished -> "Welcome";
				
			case EmployeeStatus.PreProvation -> "Waiting";
			case EmployeeStatus.Provation -> "Thank you";
			case EmployeeStatus.Retired -> "no approvement";
			default -> "no approvement";
			};
	}
	
	static String withSingleEnum(StudentStatus status) {
		return switch(status) {
			case Applied -> "Welcome";
			case Approved -> "Welcome again";
			case Finished -> "Thank you";
			default -> "no approvement";
		};
	}
}
