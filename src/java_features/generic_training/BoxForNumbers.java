package java_features.generic_training;

import java.io.Serializable;
import java.util.List;

public class BoxForNumbers<T extends Number & Comparable<T> & Serializable> {
    private T[] array;

    public BoxForNumbers(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result/ array.length ;
    }

    public int compare(BoxForNumbers<?> another) {
        if (avg() > another.avg()) {
            return 1;
        } else if (avg() == another.avg()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void method(List<? extends Number> numbers) {
    }


    public static <T> void transfer(List<? extends T> src, List<? super T> dst) {
        dst.addAll(src);
        src.clear();
    }
}
