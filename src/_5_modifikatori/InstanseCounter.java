package _5_modifikatori;

public class InstanseCounter {
    private static int numInstances = 0;

    protected static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    InstanseCounter(){
        InstanseCounter.addInstance();
    }

    public synchronized void showDetails(){};


    public static void main(String[] args) {
        System.out.println("Начиная с "+ InstanseCounter.getCount()+ " экземпляра");
        for (int i=0; i< 500; ++i){
            new InstanseCounter();
        }
        System.out.println("Создано "+ InstanseCounter.getCount()+" экземпляров");
    }
}
