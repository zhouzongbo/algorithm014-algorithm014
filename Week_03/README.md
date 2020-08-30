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