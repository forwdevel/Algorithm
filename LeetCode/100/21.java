class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        while (true) {
            if (list1.next != null && list2.next != null) {
                if (list1.val <= list2.val) {
                    list3.val = list1.val;
                    list1 = list1.next;
                    list3 = list3.next;
                    continue;
                } else {
                    list3.val = list2.val;
                    list2 = list2.next;
                    list3 = list3.next;
                    continue;
                }
            }

            if (list1.next != null && list2.next == null) {
                list3.val = list1.val;
                list1 = list1.next;
                list3 = list3.next;
                continue;
            }

            if (list1.next == null && list2.next != null) {
                list3.val = list2.val;
                list2 = list2.next;
                list3 = list3.next;
                continue;
            }

            if (list1.next == null && list2.next == null) {
                return list3;
            }
        }
    }
}