import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String newPass = "";
    private String department;
    private int passwordLength = 8;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    Scanner input = new Scanner(System.in);



    //Constructor to receive first name and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);


        //Call a method asking for the department - return the department
        department = setDepartment();
         
        if(department != null) {
            System.out.println("You chose " + department);
        }
        else
        {
            System.out.println("---"); // no value was entered
        }

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." +  lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is " + email);

        this.password = randomPassword(passwordLength);
        {
            System.out.println("Your new password is " + password);
        }
    }


    //Ask for the department
    private String setDepartment()
    {
        System.out.println("New Worker - " + firstName + ". " + "Enter a department:\n" +
                        "1: Sales\n" +
                        "2: Development\n" +
                        "3: Accounting\n" +
                        "0: None");

        int deptChoice = input.nextInt();

        switch(deptChoice)
        {
                case 1:
                    return "sales";
                case 2:
                    return "development";
                case 3:
                    return "accounting";
                default:
                    return null;
        }
    }

    public String createPassword(String newPassword)
    {

        return newPassword;
    }



    //Generate random password
    public String randomPassword(int passwordLength)
    {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            char[] password = new char[passwordLength];
            for (int i = 0; i < passwordLength; i++)
            {
                int rand = (int) (Math.random() * passwordSet.length()); //cast this in as an int
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
    }







    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }


    //Set the alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password)
    {
        this.password = password;
    }

    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String getPassword()
    {
        return password;
    }

    public String showInfo()
    {
        return "\nDISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "MB";
    }
}




