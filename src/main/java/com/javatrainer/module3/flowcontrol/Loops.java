package com.javatrainer.module3.flowcontrol;

import javax.naming.InsufficientResourcesException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static boolean TRAINERMODE = true;

    public static void main(String[] args) throws Exception {
        Loops loops = new Loops();
        // loops.theWhile_example(new Developer("Dragos"));
        //loops.theDoWhile_example(new CoffeAddictDeveloper("Alexandru"));
        loops.theFor_explained2();
    }


    public void theFor() {
        for (initialization(); executeUntilTrue(); changeVariables()) {
            performActionWithActualVariableValues();
        }

        initialization();
        while (executeUntilTrue()) {
            performActionWithActualVariableValues();
            changeVariables();
        }
    }

    int i, j;

    private void initialization() {
        i = 0;
        j = 0;
    }

    private boolean executeUntilTrue() {
        return i < 10;
    }

    private void performActionWithActualVariableValues() {
        System.out.println("Current i=" + i);
    }

    private void changeVariables() {
        i = i + 1;
    }

    public void theFor_explained1() {
        for (initialization(); executeUntilTrue(); changeVariables()) {
            performActionWithActualVariableValues();
        }

        // equivalent to
        for (i = 0; i < 10; i++) {
            performActionWithActualVariableValues();
        }
    }

    public void theFor_explained2() {
        System.out.println(" 1 x 9 =  9");
        for (int i = 1, j = 8; i <= 9 && j >= 1; i++, j--) {
            System.out.println(String.format(" %d x 9 = %d%d", i + 1, i, j));
        }
        System.out.println("10 x 9 = 90");
    }

    public void theFor_explained3() throws InsufficientResourcesException {
        int[] array = {10, 20, 30, 40, 50};
        for (int item : array) {
            System.out.println("element:" + item);
        }

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Agnes"));
        developers.add(new Developer("Mihaela-Andreea"));
        developers.add(new Developer("Mihaela-Andreea"));
        developers.add(new Developer("Ioana-Maria"));
        developers.add(new Developer("Robert-Ioan-Adrian"));
        developers.add(new Developer("Dan-Mihai"));
        developers.add(new Developer("Robert-Tiberiu"));
        developers.add(new Developer("Dragos Ioan"));
        developers.add(new Developer("Alina"));
        developers.add(new Developer("Alina-Elena"));
        developers.add(new Developer("Iulia"));
        developers.add(new Developer("Olimpia"));

        for (Developer aDeveloper : developers) {
            aDeveloper.wakeUp();
            aDeveloper.doSomeWork();
            aDeveloper.drinkCoffe();
            aDeveloper.liveYourLife();
            aDeveloper.party();
            aDeveloper.sleep();
        }
    }

    public void theWhile() {
        while (conditionIsTrue()) {
            performAction();
        }

    }

    private boolean conditionIsTrue() {
        return false;
    }

    public void theDoWhile() {
        do {
            performAction();
        } while (conditionIsTrue());
    }

    private void performAction() {

    }

    public void theWhile_example(Developer developer) throws InsufficientResourcesException {
        developer.wakeUp();

        while (developer.getDrunkCoffeCount() < 3) {
            developer.drinkCoffe();
            developer.doSomeWork();
            developer.takeABreak();
        }
        developer.liveYourLife();
        if (developer.isSalaryDay()) {
            developer.party();
        }
        developer.sleep();
    }

    public void theDoWhile_example(Developer developer) throws InsufficientResourcesException {
        developer.wakeUp();

        do {
            developer.drinkCoffe();
            developer.doSomeWork();
            developer.takeABreak();
        } while (developer.getDrunkCoffeCount() < 3);

        developer.liveYourLife();
        if (developer.isSalaryDay()) {
            developer.party();
        }
        developer.sleep();
    }

    public boolean theBreak_isThere_failed_grade(int[] grades) {
        boolean thereIs = false;
        for (int grade : grades) {
            if (grade < 5) {
                thereIs = true;
                break;
            }
        }
        System.out.println("DEBUG: Currently is there failed grade:" + thereIs);
        return thereIs;
    }

    // lines are in form: key=value
    public void theContinue_printNonEmptySettings(String[] lines) {
        for (String line : lines) {
            if (line.startsWith("#") || line.isEmpty()) {
                continue;
            }
            String[] keyValue = line.split("=");
            String key = keyValue[0];
            String value = keyValue[1];
            if (!value.isEmpty()) {
                System.out.println(key + " equals " + value);
            }
        }
    }
}

class Revolut {
    private int amount;

    public Revolut() {
        amount = 0;
    }

    public int getAvailable() {
        return amount;
    }

    public void fillUp(int newAmount) {
        amount += newAmount;
    }
}

class Developer {
    private final String name;
    private Revolut revolut = new Revolut();
    private int todaysCoffeCount;

    Developer(String name) {
        this.name = name;
    }


    public void wakeUp() {
        System.out.println(name + ": wakeUp");
        // shower
        // tooth brush
        todaysCoffeCount = 0;
    }

    public void drinkCoffe() {
        System.out.println(name + ": drinkCoffe " + (todaysCoffeCount + 1));
        todaysCoffeCount++;
    }

    public void doSomeWork() {
        System.out.println(name + ": doSomeWork");
        doSomeMagic();
    }

    public int getDrunkCoffeCount() {
        return todaysCoffeCount;
    }

    public void takeABreak() {
        System.out.println(name + ": takeABreak");
        // doing a short walk around the building
    }

    public void liveYourLife() {
        System.out.println(name + ": Living la vida loca");
        // do whatever fills you up emotionally
    }

    public void sleep() {
        System.out.println(name + ": sleeping");
        // hrrrr.....piu piu piu
    }

    public boolean isSalaryDay() {
        return Loops.TRAINERMODE || LocalDate.now().getDayOfMonth() == 10;
    }

    public void party() throws InsufficientResourcesException {
        System.out.println(name + ": trying to party");
        int availableMoney = revolut.getAvailable();
        if (availableMoney > 100) {
            System.out.println("\tPARTY Mode ON! ===> JUMP, JUMP");
            // buntzy ... buntzy
        } else {
            if (availableMoney > 0) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                throw new InsufficientResourcesException("Not enough money! Did you have done some work or just drunk coffe? Whatever... you can buy a shaorma...");
            } else {
                throw new InsufficientResourcesException("You even don't have money for Pufuleti! Did you have done some work or just drunk coffe?");
            }
        }
    }

    private void doSomeMagic() {
        revolut.fillUp(100);
    }
}

class CoffeAddictDeveloper extends Developer {
    CoffeAddictDeveloper(String name) {
        super(name);
    }

    public void wakeUp() {
        super.wakeUp();
        drinkCoffe();
        drinkCoffe();
        drinkCoffe();
    }
}