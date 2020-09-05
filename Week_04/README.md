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
            
            
                private void travel(TreeNode root,int level,List<List<Integer>> results){
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