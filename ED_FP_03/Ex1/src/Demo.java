import Exceptions.EmptyCollectionException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) {

        int test = 1;
        ArrayStack<Integer> st = new ArrayStack();

        try {
            switch(test){
                case 1: //add elements
                    st.push(1);
                    st.push(2);
                    st.push(3);
                    st.push(4);
                    st.push(5);
                    st.push(6);
                    System.out.println(st.toString());
                    break;
                case 2: //remove
                    st.push(1);
                    st.push(2);
                    st.push(3);
                    st.push(4);
                    st.push(5);
                    st.push(6);
                    st.pop();
                    st.pop();
                    System.out.println(st.toString());
                    break;
                case 3: //remove with empty list
                    st.pop();
                    break;
                case 4: //peak
                    st.push(1);
                    st.push(2);
                    st.push(3);
                    st.push(4);
                    st.push(5);
                    st.push(6);
                    System.out.println(st.peek());
                    break;
                default: break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}
