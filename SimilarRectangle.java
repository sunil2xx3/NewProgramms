import java.util.ArrayList;

public class SimilarRectangle {
    

    public void rectangle(){
        
        ArrayList<ArrayList<Integer>> rectangles = new ArrayList<>();

        rectangles.add(new ArrayList<>(2) {{ add(8); add(17); }});
        rectangles.add(new ArrayList<>(2) {{ add(5); add(6); }});
        rectangles.add(new ArrayList<>(2) {{ add(3); add(16); }});
        rectangles.add(new ArrayList<>(2) {{ add(8); add(17); }});
        rectangles.add(new ArrayList<>(2) {{ add(6); add(8); }});
        System.out.println(rectangles);
        int count =0;
        for ( int i = 0; i < rectangles.size(); i++) {
            for (int j = i+1; j <rectangles.size(); j++) {
                if(rectangles.get(i).get(0)*rectangles.get(i).get(1)==rectangles.get(j).get(0)*rectangles.get(j).get(1)){
                    count+=1;
                } 
            }
        }
            System.out.println(count);

    }
    public static void main(String[] args) {
        new SimilarRectangle().rectangle();
    }

}


