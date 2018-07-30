package assessment2.question3;


class UserMainCode
{
 	static boolean checkTripplets(int[] a)
 	{
 	
 	int i=0;
       int n =a.length; //array length//
       for(i=0;i<n;i++)
       {
       	if(i==(n-2))
       	break;
       	if((a[i]==a[i+1])&&(a[i]==a[i+2])) //checks for tripplets//
       	return true;
       	
       }
 	return false;
 	}
}