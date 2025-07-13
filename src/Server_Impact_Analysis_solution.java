import java.util.*;
public class Server_Impact_Analysis_solution {



		    public static int getMaxImpactedServers(List<Integer> priority, int k) {
		        int n = priority.size();
		        int count =0;
		        priority.sort(null);
		        //System.out.println(priority);
		        boolean T = true;
		        while(T) {
		        	boolean changed = false;
		        	//try{
		        	//System.out.println("At beg"+priority);
		        	
		        	int a= priority.get(priority.size()-1);
		        	int b= a-k;
		        	int i = priority.size()-2;
		        	
		        	//priority.removeIf(value -> value >= b);
		        	Iterator<Integer> itr = priority.iterator();
		        	int c2=0;
		        	int limit = priority.size() - 1;
		        	while (itr.hasNext() && c2<limit) {
		        	    Integer value = itr.next();
		        	    if (value >= b && value!=a) {
		        	        itr.remove();
		        	        changed = true;
		        	        count++;
		        	        
		        	        break;// ✅ Safe removal
		        	    }
		        	    c2++;
		        	}
		        	//}
		        	//catch(Exception e) {return 45;}
		        	//finally {
		        	if (!changed) priority.remove(priority.size()-1);
		        	if(priority.size()<=1) T=false;
		        	//System.out.println("At end"+priority);
		        	//System.out.println("Count "+count);
		        	//}
		        }
		   
		       return count;  
		        

		    }

		    public static void main(String[] args) {
		        // Sample Input
		        List<Integer> priority = new ArrayList<>(Arrays.asList(2, 8, 3, 5));
		        int k =6;

		        // Expected Output: 3
		        System.out.println(getMaxImpactedServers(priority, k));
		    }
		}




