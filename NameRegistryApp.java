// application class
public class NameRegistryApp
{
  public static void main (String[] args)
  {
    NameRegister nameRegister = new NameRegister ();
    UserInterface ui = new UserInterface ();
    
    try (DataSource dataSource = new DataSource ())
    {
      run (nameRegister, ui, dataSource);
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }

  // application logic
  public static void run (NameRegister nameRegister, UserInterface ui, DataSource dataSource)
  {
    String[] names = ui.readNames (dataSource); // read names from user
    nameRegister.setNames (names); // store names into register
    ui.showNames (nameRegister.getNames ()); // show names in registers to user
  }
}
