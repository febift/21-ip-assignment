package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
public class RoleAccess {

    public static void main(String[] args) {
        int menuIndex = 0;
<<<<<<< HEAD
<<<<<<< HEAD
        int subMenuIndex = 0;
        boolean isValidRole = false;

    if (args.length == 0) {
        System.out.println("What role you want to see ?");
        System.out.println("For example, try 'Admin'.");
    } else if (args.length == 1) {
          switch (args[0]) {
              case "Super Admin":
              case "Admin":
              case "User":
                  isValidRole = true;
                  break;
      }
      if (isValidRole == true) {
          switch (args[0] ) {
            case "Super Admin":
              menuIndex = menuIndex + 1;
              System.out.printf("%d. Super Admin\n", menuIndex);
              subMenuIndex = subMenuIndex + 1;
              System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
              subMenuIndex = subMenuIndex + 1;
              System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
              subMenuIndex = subMenuIndex + 1;
              System.out.printf("%2d.%d. CRUD User \n", menuIndex, subMenuIndex);
               System.out.println();
            case "Admin":
=======
    int subMenuIndex = 0;
    boolean isValidRole = false;
=======
        int subMenuIndex = 0;
        boolean isValidRole = false;
>>>>>>> ae48871 (fix(conditional/RoleAccess): add 'switch' and change indentasi)

    if (args.length == 0){
        System.out.println("What role you want to see ?");
        System.out.println("For example, try 'Admin'.");
    }else if(args.length == 1){
      switch (args[0]) {
          case "Super Admin":
          case "Admin":
          case "User":
          isValidRole = true;
          break;
      }
      if(isValidRole == true){
          switch (args[0] ){
              case "Super Admin":
                menuIndex = menuIndex + 1;
                System.out.printf("%d. Super Admin\n", menuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. CRUD User \n", menuIndex, subMenuIndex);
                System.out.println();
              case "Admin":
>>>>>>> 9a107a0 (feat(conditional/RoleAccess): add 'java.util.Scanner' object)
                menuIndex = menuIndex + 1;
                subMenuIndex = 0;
                System.out.printf("%d. Admin\n", menuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
              default:
                menuIndex = menuIndex + 1;
                subMenuIndex = 0;
                System.out.printf("%d. User\n", menuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                subMenuIndex = subMenuIndex + 1;
                System.out.printf("%2d.%d", menuIndex, subMenuIndex);
              break;
          }
      }else {
        System.out.println("Invalid Role");
        System.out.println("Valid Role : Super Admin, Admin, User");
      }
    }else{
      System.out.println("Too many argument");
    }
    }
}
