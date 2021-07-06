import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Person> side1 = new HashSet<Person>();
        Set<Person> side2 = new HashSet<Person>();

        side1.add(new Person(5));
        side1.add(new Person(10));
        side1.add(new Person(20));
        side1.add(new Person(25));


        System.out.println(bridgeSolver(side1, side2));

    }


    public static int bridgeSolver(Set<Person> side1, Set<Person> side2){

        while (side1.size() != 0){

            //Send the 2 fastest from 1 to 2
            movePersonToOtherSide(findFastest(side1), side1, side2);
            movePersonToOtherSide(findFastest(side1), side1, side2);

            //Send the fastest from 2 to 1
            movePersonToOtherSide(findFastest(side2), side2, side1);

            //Send the 2 slowest from 1 to 2
            movePersonToOtherSide(findSlowest(side1), side1, side2);
            movePersonToOtherSide(findSlowest(side1), side1, side2);

            //Send the fastest from 2 to 1
            movePersonToOtherSide(findFastest(side2), side2, side1);
        }

        return 0;
    }

    //Returns fastest person of a set.
    public static Person findFastest(Set<Person> persons){
        Person fastest = null;
        int fastestTime = Integer.MAX_VALUE;
        if (persons.size() > 0){
            for (Person p : persons){
                if (p.timeUsed < fastestTime){
                    fastest = p;
                    fastestTime = p.timeUsed;
                }
            }
        }
        return fastest;
    }

    //Returns slowest person of a set.
    public static Person findSlowest(Set<Person> persons){
        Person slowest = null;
        int slowestTime = Integer.MIN_VALUE;
        if (persons.size() > 0){
            for (Person p : persons){
                if (p.timeUsed > slowestTime){
                    slowest = p;
                    slowestTime = p.timeUsed;
                }
            }
        }
        return slowest;
    }

    public static int movePersonToOtherSide(Person p, Set<Person> sideFrom, Set<Person> sideTo){

        if (sideFrom.contains(p)){
            sideFrom.remove(p);
            sideTo.add(p);
            return p.timeUsed;
        }
        return 0;
    }

}
