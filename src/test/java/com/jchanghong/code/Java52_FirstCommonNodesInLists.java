/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题52：两个链表的第一个公共结点
 * // 题目：输入两个链表，找出它们的第一个公共结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Java52_FirstCommonNodesInLists extends UtilAssert {
    LinkNode parent(LinkNode f1, LinkNode f2) {
        Map<LinkNode, Boolean> map = new HashMap<>();
        while (f1 != null) {
            map.put(f1, true);
            f1 = f1.next;
        }
        while (f2 != null) {
            if (map.containsKey(f2)) {
                return f2;
            }
            f2 = f2.next;
        }
        return null;
    }

    @Test
    public void test() throws Exception {
        LinkNode l1 = new LinkNode(1, null);
        l1.next = new LinkNode(2, null);
        l1.next.next = new LinkNode(3, null);
        LinkNode l2 = new LinkNode(4, l1.next);
        isTrue(parent(l1, l2) == l1.next);
    }
}
