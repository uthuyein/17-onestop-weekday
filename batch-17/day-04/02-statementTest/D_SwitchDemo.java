class D_SwitchDemo{
	public static void main(String[] args) {
		// swithWithLambdaNotation(args[0]);
		
		String result = switchWithYield(args[0]);
		System.out.println(result);
	}

	private static String switchWithYield(String day){
		return switch(day){
			case "Mon","Tues","Wed","Thur","Fri" -> "Work Day";
			case "Sat","Sun" ->{
				System.out.println("Yeild use more than one statement");
				yield "Off Day";
			}
			default -> "Something wrong";
		};
	}

	private static String switchExpression(String day){
		return switch(day){
			case "Mon","Tues","Wed","Thur","Fri" ->  "Work Day";		
			case "Sat","Sun" -> "Off Day";
			default -> "Something wrong";
		};
	}

	private static void swithWithLambdaNotation(String day){
		switch(day){
			case "Mon","Tues","Wed","Thur","Fri" -> System.out.println("Work Day");		
			case "Sat","Sun" -> System.out.println("Off Day");
			default -> System.out.println("Something wrong");
		}
	}

	private static void swithWithNested(String day){
		switch(day){
		case "Mon","Tues","Wed","Thur","Fri":
			switch(day){
				case"Wed":
					System.out.println("Work with Formal suit ");
					break;
				case"Fri":
					System.out.println("Half day !");
					break;
			}
			System.out.println("Work day !");
			break;

		case "Sat","Sun":
			System.out.println("Off Day !");
			break;

		default:
			System.out.println("Something wrong !");
			break;
		}
	}

	private static void switchWithLabel(String name){

		switch(name){
		case "Andrew","William","Michael":
			System.out.println("You have allowed to enter");
			break;
		default:
			System.out.print("Your not allowed to enter");
			break;

		}
	}

	private static void oldStyle(String name){
		switch(name){
		case "Andrew":
			System.out.println("This is floral andrew");
			break;
		case "William":
			System.out.println("This is william paul");
			break;
		case "Michael":
			System.out.print("This is Michael Bennett");
			break;
		default:
			System.out.print("Something wrong");
			break;

		}
	}
}