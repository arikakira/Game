public class Main {
    public static void main(String[] args) {
        Game one = new Game();      // test case 1
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();

        System.out.println(one.getScore());

        Game two = new Game();      // test case 2
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());

        Game three = new Game();        // test case 3
        three.getLevel(1).reachGoal();
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100);
        three.getLevel(3).reachGoal();
        three.getLevel(3).setPoints(500);
        three.makeBonus();
        System.out.println(three.getScore());

        Game four = new Game();     // test case 4
        four.getLevel(1).setPoints(200);
        four.getLevel(2).reachGoal();
        four.getLevel(2).setPoints(100);
        four.getLevel(3).reachGoal();
        four.getLevel(3).setPoints(500);
        System.out.println(four.getScore());

        Game five = new Game();
        System.out.println(five.playManyTimes(4));
    }
}