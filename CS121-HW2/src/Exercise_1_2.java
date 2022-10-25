import java.util.Arrays;

public class Exercise_1_2 {
    static String[] stringSet = {"Other", "entries", "include",
        "a", "historic", "district", "in", "Charlottesville", "Virginia", "cut-flower", "greenhouse",
        "complex"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FindShortestStrings(stringSet)));
    }

    static String[] FindShortestStrings(String[] _set){
        String[] _output = new String[_set.length / 3];
        for (int i = 0; i < _set.length; i += 3){
            String _shortest = _set[i];
            for (int j = 1; j < 3; j++){
                if (_set[i+j].length() < _shortest.length()) _shortest = _set[i+j];
            }
            _output[i / 3] = _shortest;
        }
        return _output;
    }
}

//Big O: running time: O(n)