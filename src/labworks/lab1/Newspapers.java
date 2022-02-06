package labworks.lab1;

import java.util.Random;

public class Newspapers {
    private String name;
    private String type;
    private float price;
    private int periodicity;
    private String company;
    private String fullNameDirector;

    public Newspapers(String name, String type, float price, int periodicity, String company, String fullNameDirector) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.periodicity = periodicity;
        this.company = company;
        this.fullNameDirector = fullNameDirector;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFullNameDirector(String fullNameDirector) {
        this.fullNameDirector = fullNameDirector;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public String getCompany() {
        return company;
    }

    public String getFullNameDirector() {
        return fullNameDirector;
    }

    @Override
    public String toString() {
        return "Newspapers{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", periodicity=" + periodicity +
                ", company='" + company + '\'' +
                ", fullNameDirector='" + fullNameDirector + '\'' +
                '}';
    }

    public static Newspapers[] createArray(int count) {
        String[] nameArr = new String[]{"Forbes", "OTTOBRE", "Вишиванка", "Megatour", "ВСЕ О РУКОДЕЛИИ", "Florium",
                "Sanwerk", "Vivienne", "Адеф-Украина", "Диана плюс"};
        String[] typeArr = new String[]{"Газета", "Журнал", "Ежегодник", "Научный журнал", "Календари", "Литературный журнал", "Справочник", "Литература", "Библиографический указатель", "Реферативный сборник"};
        String[] companyArr = new String[]{"Грамота", "Ранок", "Освіта", "Генеза", "Академія", "Дух і Літера", "Аверс", "Країна Мрій", "Основи", "Дніпро"};
        String[] fullNameArr = new String[]{"Суворов Константин Иванович", "Сидоров Даниил Дмитриевич", "Крылов Ярослав Артёмович", "Васильев Савелий Георгиевич", "Петров Артём Евгеньевич", "Николаев Тимофей Дмитриевич", "Егоров Василий Львович", "Соколов Андрей Львович", "Степанов Максим Андреевич", "Иванов Тимофей Дамирович"};
        Newspapers[] array = new Newspapers[count];
        for (int i = 0; i < array.length; i++) {
            int randNameIndex = new Random().nextInt(nameArr.length);
            int randTypeIndex = new Random().nextInt(typeArr.length);
            float randPrice = 70 + new Random().nextFloat() * (500 - 70);
            int randPeriod = 1 + (int) (new Random().nextFloat() * (14 - 1));
            int randCompanyIndex = new Random().nextInt(companyArr.length);
            int randFullNameIndex = new Random().nextInt(fullNameArr.length);
            Newspapers obj = new Newspapers(nameArr[randNameIndex], typeArr[randTypeIndex], randPrice, randPeriod, companyArr[randCompanyIndex], fullNameArr[randFullNameIndex]);
            array[i] = obj;
        }
        return array;
    }

    public static void chooseNewspapersWithCurrentType(String type, Newspapers[] array) {

        for (Newspapers newspapers : array) {
            if (newspapers.type.equals(type)) {
                System.out.println(newspapers);
            }
        }
    }

    public static void chooseNewspaperWithIssueEveryWeek(Newspapers[] array){
        for (Newspapers newspapers : array) {
            if (newspapers.periodicity <= 7) {
                System.out.println(newspapers);
            }
        }
    }
    public static void chooseNewspaperWithCurrentCompanyNameAndCurrentPrice(Newspapers[] array,String company,float maxPrice){
        for (Newspapers newspapers : array) {
            if (newspapers.company.equals(company) && newspapers.price <= maxPrice) {
                System.out.println(newspapers);
            }
        }
    }
}
