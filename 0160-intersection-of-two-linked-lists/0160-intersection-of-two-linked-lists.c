/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if (headA == NULL || headB == NULL) {
        return NULL;
    }

    // Step 1: Traverse both lists to find lengths and last nodes
    int lenA = 0, lenB = 0;
    struct ListNode *tailA = NULL, *tailB = NULL;

    struct ListNode *tempA = headA;
    while (tempA->next != NULL) {
        tempA = tempA->next;
        lenA++;
    }
    tailA = tempA;

    struct ListNode *tempB = headB;
    while (tempB->next != NULL) {
        tempB = tempB->next;
        lenB++;
    }
    tailB = tempB;

    // Step 2: If the last nodes are different, there is no intersection
    if (tailA != tailB) {
        return NULL;
    }

    // Step 3: Determine the difference in lengths
    int diff = abs(lenA - lenB);

    // Step 4: Move the head of the longer list forward by diff nodes
    if (lenA > lenB) {
        while (diff > 0) {
            headA = headA->next;
            diff--;
        }
    } else {
        while (diff > 0) {
            headB = headB->next;
            diff--;
        }
    }

    // Step 5: Traverse both lists together until the intersection point
    while (headA != headB) {
        headA = headA->next;
        headB = headB->next;
    }

    // Either headA or headB is the intersection point
    return headA;
}