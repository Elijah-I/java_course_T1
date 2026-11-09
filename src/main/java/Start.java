void main() {
    IO.println(Arrays.toString(addArray(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 3)));
}

int[] addArray(int[] arr, int[] ins, int pos) {
    int arrOffset = 0;
    int totalLength = arr.length + ins.length;
    int[] result = new int[totalLength];

    for (int i = 0; i < totalLength; i++) {
        if (i >= pos && i < pos + ins.length) {
            result[i] = ins[arrOffset];
            arrOffset++;
            continue;
        }

        result[i] = arr[i - arrOffset];
    }

    return result;
}

int[] add(int[] arr, int x, int pos) {
    int arrOffset = 0;
    int[] result = new int[arr.length + 1];

    for (int i = 0; i < result.length; i++) {
        if (i == pos) {
            result[i] = x;
            arrOffset++;
            continue;
        }

        result[i] = arr[i - arrOffset];
    }

    return result;
}

int[] deleteNegative(int[] arr) {
    int clearLength = 0;
    int[] tmpClear = new int[arr.length];

    for (int num : arr) {
        if (num < 0) continue;

        tmpClear[clearLength] = num;
        clearLength++;
    }

    if (clearLength == tmpClear.length) return tmpClear;

    int[] clear = new int[clearLength];
    System.arraycopy(tmpClear, 0, clear, 0, clearLength);
    return clear;
}

int[] findAll(int[] arr, int x) {
    int count = 0;
    int[] tmpResult = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            tmpResult[count] = i;
            count++;
        }
    }

    if (count == tmpResult.length) return tmpResult;

    int[] result = new int[count];
    System.arraycopy(tmpResult, 0, result, 0, count);

    return result;
}

int[] concat(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];

    for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
        if (i < arr1.length) result[i] = arr1[i];
        if (i < arr2.length) result[i + arr1.length] = arr2[i];
    }

    return result;
}

int[] reverseBack(int[] arr) {
    int[] reversed = new int[arr.length];

    for (int i = 0, j = arr.length - 1; j >= 0; i++, j--) {
        reversed[i] = arr[j];
    }

    return reversed;
}

void reverse(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

boolean isPalindrome(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
        if (arr[i] != arr[j]) return false;
    }

    return true;
}

int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) return i;
    }
    return -1;
}

int findLast(int[] arr, int x) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == x) return i;
    }
    return -1;
}

int maxAbs(int[] arr) {
    int max = 0;
    for (int num : arr) {
        if (Math.abs(num) > max) max = Math.abs(num);
    }
    return max;
}

int countPositive(int[] arr) {
    int count = 0;
    for (int num : arr) {
        if (num > 0) count++;
    }
    return count;
}

