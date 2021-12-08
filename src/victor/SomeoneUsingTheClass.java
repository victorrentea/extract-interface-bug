package victor;

public class SomeoneUsingTheClass {
   private final TheClass theClass;

   public SomeoneUsingTheClass(TheClass theClass) {
      this.theClass = theClass;
   }

   public void method() {
      theClass.publicMethod();
   }
}
