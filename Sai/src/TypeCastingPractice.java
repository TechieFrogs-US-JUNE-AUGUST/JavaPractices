public class TypeCastingPractice {
    int a = 30;
    long b = a; //Widening or Automatic type conversion
    //int c = b; // we can not assign higher datatype to lower datatype
    int c = (int)b;  // Narrowing or Explicit type conversion
    // (datatype)variable; so we can convert the higher datatype to lower datatype using "type casting"
    float f = 9.00f;
    double d = 10.1010;
    //int i = c*f; // we can not give higher datatype to lower
    //int i = (int)c*f;//here only c only converts in to an int not the whole expression
    int i = (int)(c*f); // here entire equation is in the braces, so it converts the entire into an int
    
    
}
