import java.util.Scanner;

// data source for reading names
public class DataSource implements AutoCloseable
{
  public DataSource ()
  {
    scanner = new Scanner (System.in);
  }

  // returns next line (name), return value is empty string if no more
  // names are available
  public String readName ()
  {
    if (scanner.hasNextLine ())
      return scanner.nextLine ();
    else
      return "";
  }

  public void close ()
  {
    scanner.close ();
  }

  private Scanner scanner;
}

