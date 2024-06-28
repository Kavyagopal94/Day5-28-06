import java.util.Random;

class Employee {
	    
    // Method to compute employee wages
    public static void computeEmployeeWage(String company, int wagePerHour, int maxHoursInMonth, int maxWorkingDays) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWages = 0;
    	

        while (totalWorkingHours <= maxHoursInMonth && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;
            int dailyHours = 0;

            int attendance = (int) (Math.random() * 3); //0, 1, 2
            switch (attendance) {
                case 0:
                    dailyHours = 0; // 0 hours absent
                    break;
                case 1:
                    dailyHours = 4; // 4 hours for part-time
                    break;
                case 2:
                    dailyHours = 8; // 8 hours for full-time
                    break;
            }

            totalWorkingHours += dailyHours;
            totalWages += dailyHours * wagePerHour;

            System.out.println("Day " + totalWorkingDays + ": Hours Worked " + dailyHours + " : Total Hours: " + totalWorkingHours);
 
        }

        System.out.println();
        
        System.out.println("Company: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wages: " + totalWages);
        
        System.out.println();
    }

    public static void main(String[] args) 
    {   
    	computeEmployeeWage("Company XYZ", 20, 100, 20);
    	computeEmployeeWage("Company ABC", 25, 120, 22);
    	computeEmployeeWage("Company 123", 15, 90, 18);
    }
}
