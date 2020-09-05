学习笔记

# 一、深度优先搜索和广度优先搜索
## 1.dfs 深度优先模板
       class Solution {
            public class TreeNode {
                int val;
                TreeNode left;
                TreeNode right;
            
                TreeNode(int x) {
                    val = x;
                }
            }
            
            public List<List<Integer>> levelOrder(TreeNode root) {
                    List<List<Integer>> allResults = new ArrayList<>();
                    if(root==null){
                        return allResults;
                    }
                    travel(root,0,allResults);
                    return allResults;
                }
            
            
                private void travel(TreeNode root, int level,List<List<Integer>> results){
                    // 递归终止条件
                    if(results.size()==level){
                        results.add(new ArrayList<>());
                    }
                    // 当前层逻辑
                    results.get(level).add(root.val);
                    // 进入下一层
                    if(root.left!=null){
                        travel(root.left,level+1,results);
                    }
                    if(root.right!=null){
                        travel(root.right,level+1,results);
                    }
                    // 恢复状态
                }
       }     
## 2.bfs 广度优先模板
        class Solution {
            public class TreeNode {
                int val;
                TreeNode left;
                TreeNode right;
            
                TreeNode(int x) {
                    val = x;
                }
            }
            
            public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>> ans = new ArrayList<>();
                if (root == null) {
                    return ans;
                }
                // 队列
                Queue<Integer> nodes = new LinkedList<>();
                // 头结点加入到队列中
                nodes.offer(root);
                
                while (!nodes.isEmpty()) {
                    int size = nodes.size();
                    List<Integer> results = new ArrayList<>();
                    for (int i = 0; i < size; i++) {
                        TreeNode node = nodes.poll();
                        results.add(node.val);
                        if (node.left != null) {
                            nodes.add(node.left);
                        }
                        if (node.right != null) {
                            nodes.add(node.right);
                        }
                    }
                    ans.add(results);
                }
                return ans;
            }
        }
 # 贪心算法
   ## 概念
        贪心算法是一种在每一步选择中都采取在当前状态下最好或最优(即最有利)的选择, 从而希望导致结果是全局最好或最优的算法
   ## 贪心算法和动态规则的区别
        贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择, 不能回退.
        动态规划则会保存以前的运算结果, 并根据以前的结果对当前的进行选择, 有回退功能 