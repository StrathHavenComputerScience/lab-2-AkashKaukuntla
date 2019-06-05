public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    cleanrow();
    cleanrow();
    cleanrow();
    cleanrow();
  }
  //precondition:The whole path is dark.
  //postcondition:The whole path is light.
  public static void cleanSpace()
  {
      Robot.move();
      Robot.makeLight();
    }
  //precondition:The square in front of the bot is dark.
  //postcondition:The square in front of the bot is light.
  public static void cleanrow()
  {
     cleanSpace();
     cleanSpace();
     cleanSpace();
     cleanSpace();
     cleanSpace();
     Robot.move();
     Robot.turnLeft();
    }
  //precondition:The row is dark.
  //postcondition:The row is light.
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //precondition:Robot is facing any direction.
  //postcondition:Robot is facing 90 degrees clockwise.
  public static void squareDarken()
  {
      Robot.move();
      Robot.makeDark();
    }
  //precondition:Square in front is light.
  //postcondition:Square in front is dark
  public static void rowDark()
  {
      turnRight();
      squareDarken();
      squareDarken();
      squareDarken();
      squareDarken();
      squareDarken();
      squareDarken();
    }
  //precondition:The row in front of the bot is light.
  //postcondition:The row in front of the bot is dark.
  public static void comeback() 
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      turnRight();
    }
  //precondition:The bot is at the end of a row.
  //postcondition:The bot is at the beginning of a row facing up.
  public static void combRow()
  {
      rowDark();
      comeback();
      squareDarken();
      squareDarken();
    }
  //precondition:The row and in between rows are light.
  //postcondition:The row and in between rows are dark.
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    Robot.makeDark();
    combRow();
    combRow();
    combRow();
    combRow();
    rowDark();
    comeback();
  }
  //precondition:The whole comb is light.
  //postcondition:The whole comb is dark.
  public static void moveCheckered()
  {
      Robot.move();
      Robot.makeDark();
      Robot.move();
    }
  //precondition:The two squares in front are light.
  //postcondition:The two squares in front is dark then light.
  public static void makeCheckerRow()
  {
      moveCheckered();
      moveCheckered();
      moveCheckered();
      Robot.move();
      Robot.makeDark();
    }
  //precondition:The row in front of the bot is light.
  //postcondition:The row is checkered starting with light box.
  public static void moveBack()
  {
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
    }
  //precondition:The bot is facing down at the back of a row.
  //postcondition:The bot is 7 spaces down from where it was.
  public static void comeBack()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      moveBack();
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
    }
  //precondition:The bot is facing up at the end of a row.
  //postcondition:The bot is facing up at the beginning of the next row.
  public static void makeOtherCheckered()
  {
      Robot.makeDark();
      Robot.move();
      Robot.move();
    }
  //precondition:The square the bot is on is light.
  //postcondition:The square the bot was on is dark and it is two squares from where it was.
  public static void makeOtherCheckerRow()
  {
      makeOtherCheckered();
      makeOtherCheckered();
      makeOtherCheckered();
      Robot.makeDark();
      Robot.move();
    }
  //precondition:The row in front of the bot is light.
  //postcondition:The row is checkered starting with a dark square.
  public static void makeTwoRows()
  {
      makeOtherCheckerRow();
      comeBack();
      makeCheckerRow();
      comeBack();
    }
  //precondition:The row in front of the bot and beside the bot is light.
  //postcondition:The two rows are checkered.
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    makeTwoRows();
    makeTwoRows();
    makeTwoRows();
    makeOtherCheckerRow();
    comeBack();
    makeCheckerRow();
  }
  //precondition:The whole board is light.
  //postcondition:The whole board is checkered.
}
