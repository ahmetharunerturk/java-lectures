public class operators {
  public static void main(String[] args) {
    int sum1 = 100 + 50;
    int sum2 = sum1 + 250;
    int sum3 = sum2 + sum2;

    int mod1 = 15;
    int mod2 = 4;

    int mod = mod1%mod2;
    System.out.println(mod); 
    
    int x = 5;
    int y = 3;
    System.out.println(x > y); //true 


    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3); 


    
  }
}
/* 
    +	Addition	Adds together two values	x + y	
    -	Subtraction	Subtracts one value from another	x - y	
    *	Multiplication	Multiplies two values	x * y	
    /	Division	Divides one value by another	x / y	
    %	Modulus	Returns the division remainder	x % y	
    ++	Increment	Increases the value of a variable by 1	++x	
    --	Decrement	Decreases the value of a variable by 1	--x

    =	x = 5	x = 5	
    +=	x += 3	x = x + 3	
    -=	x -= 3	x = x - 3	
    *=	x *= 3	x = x * 3	
    /=	x /= 3	x = x / 3	
    %=	x %= 3	x = x % 3	
    &=	x &= 3	x = x & 3	
    |=	x |= 3	x = x | 3	
    ^=	x ^= 3	x = x ^ 3	
    >>=	x >>= 3	x = x >> 3	
    <<=	x <<= 3	x = x << 3

    ==	Equal to	x == y	
    * !=	Not equal	x != y	
    >	Greater than	x > y	
    <	Less than	x < y	
    >=	Greater than or equal to	x >= y	
    <=	Less than or equal to	x <= y


    && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
    || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
    *!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

 */