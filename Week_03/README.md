学习笔记

# 递归
## 1.递归模板: Java
    public void recur(int level, int param) { 
      // terminator 终止条件, 递归基 
      if (level > MAX_LEVEL) { 
        // process result 
        return; 
      }
      // process current logic 处理当前层逻辑  
      process(level, param); 
      // drill down 进入下一层
      recur( level: level + 1, newParam); 
      // restore current status 恢复当前层状态 
     
    }


## 2. 递归思维要点
    2.1 不要人肉去进行递归(最大误区) ps: 前期可以适当画一下递归状态树, 后期尽量不要再画了
    2.2 找到最近最简的方法, 将其拆分成可重复解决的问题(重复子问题) --- 最近重复性
    2.3 数学归纳法思维
    
# 分治和回溯

##  特性
###  1.分治本质就是递归(找重复性、分解、组合)
###  2.分治代码模板
    private static void divide_conquer(Problem problem) {
        // 递归终止条件
        if (problem == null) {
            int res = process_last_result();
            return res;
        }
        // 处理当前逻辑
        subProblems = split_problem(problem);
        // 拆分问题
        res0 = divide_conquer(subProblems[0]);
        res1 = divide_conquer(subProblems[1]);
        // 合并问题
        result = process_result(res0, res1);
        // 恢复状态
        return result;
    }
    

### 1.回溯
      本质上也是递归的思想








