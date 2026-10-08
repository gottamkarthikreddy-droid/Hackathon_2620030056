import java.util.Scanner;
public class Hackathon{
    // 2C
 double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
 {
    return(int) (morningEnergy + eveningEnergy);
 }
 //2B
 void EnergyGeneration(double Kwh)
 {
    if(Kwh>10.0)
    {
        System.out.println("Good Energy Generation");
    }
    else
    {
        System.out.println("Low Energy Generation");
    }
 }
 String SystemStatus(Scanner scan, String Status)
 {
    while(true){
           
            if(Status.equalsIgnoreCase("True")||Status.equalsIgnoreCase("False"))
            {
                break;
            }
            else{
                System.out.println("Invalid input. Please enter True or False");
                Status = scan.nextLine();
            }
            
        }
        return Status;
 }
void DisplayStatus ( int panelid, double energy , int solar , String status)
{
    System.out.println("Panel ID: " + panelid);
    EnergyGeneration(energy);
    System.out.println("Number of Solar Panels: " + solar);
    System.out.println("System Status: " + status);
    System.out.println("\n");
    
    
}







    public static void main(String[] args)
    {
        //2A
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Panel id : ");
        int PanelId = scan.nextInt();
        System.out.println("Enter Energy in Kwh : ");
        double EnergyKwh = scan.nextDouble();
        System.out.println("Enter number of Solar Panels : ");
        int NoofSolar = scan.nextInt();
            scan.nextLine();
        System.out.println("Enter System Status (either True or False) ");
        String Status = scan.nextLine();
        

        
        
    
        Hackathon Energy = new Hackathon();
        Status = Energy.SystemStatus(scan, Status);
        
        Energy.DisplayStatus(PanelId, EnergyKwh, NoofSolar, Status);

        System.out.println("Enter Morning Energy Generation :");
        double MorningEnergy = scan.nextDouble();
        System.out.println("Enter Evening Energy Generation :");
        double EveningEnergy = scan.nextDouble();
       System.out.println("Total energy is : "+ Energy.calculateTotalEnergy(MorningEnergy, EveningEnergy));
       scan.close();

    }

}