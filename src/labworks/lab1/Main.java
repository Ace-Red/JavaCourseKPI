package labworks.lab1;



public class Main {

    public static void main(String[] args) {
        Newspapers[] array = Newspapers.createArray(50);
        for (Newspapers newspapers : array) {
            System.out.println(newspapers);
        }
        System.out.println("=================");
        Newspapers.chooseNewspapersWithCurrentType("Справочник",array);
        System.out.println("=================");
        Newspapers.chooseNewspaperWithIssueEveryWeek(array);
        System.out.println("=================");
        Newspapers.chooseNewspaperWithCurrentCompanyNameAndCurrentPrice(array,"Аверс",400);
    }

}
