class Solution {
    /*What we do ?
1. Init: Init the two HashMaps.
2. Build Map: Put the child into parent's list ; Increase child's in-degree by 1.
3. Find Node with 0 in-degree: Iterate the inDegree map, find the Node has 0 inDegree. (If none, there must be a circle)
4. Decrease the children's inDegree by 1: Decrease step3's children's inDegree by 1.
5. Remove this Node: Remove step3's Node from inDegree. Break current iteration.
6. Do 3-5 until inDegree is Empty: Use a while loop
*/
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        Map<Integer,List<Integer>> adjListMap = new HashMap<>() ;
        int[] topoOrder = new int[numCourses];
        int idx = 0;
        
        for(int[] pair:prerequisites){
            int preCourse = pair[1], curCourse = pair[0];
            inDegree[curCourse]++;
            adjListMap.computeIfAbsent(preCourse,k->new ArrayList<Integer>()).add(curCourse);
        }
        //0 indegree queue
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0) queue.addLast(i);
        }
        
        while(!queue.isEmpty()){
            int node = queue.removeFirst();
            topoOrder[idx++] = node;
            if(adjListMap.containsKey(node)){
                adjListMap.get(node).forEach(child->{
                    if(--inDegree[child]==0)
                        queue.addLast(child);
                });
            }
        }
        if(idx==numCourses) return topoOrder;
        return new int[0];
    }
}