public class MergeTwosorted {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};

        int start1 = nums1.length - 1;
        int start2 = nums2.length - 1;
        int index = start1 + start2 - 1;
        while (start1 >= 0 && start2 >= 0) {
            if (nums1[start1] > nums2[start2]) {
                nums1[index] = nums1[start1];
                start1--;
            } else {
                nums1[index] = nums2[start2];
                start2--;
            }
            index--;
        }
        while (start2>=0) {
            nums1[index] = nums2[start2];
            start2--;
            index--;

        }
        }


        }
