class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var lReturn = -1
        if (nums.size>0){
            run lit@{
                nums.toList().forEach {
                    if (it==target){
                        lReturn = nums.indexOf(it)
                        return@lit
                    }else if (target<it && lReturn<0){
                        lReturn = nums.indexOf(it)
                    }
                }
            }
            if (lReturn<0){
                lReturn = nums.size
            }
        }
        return lReturn
    }
}

fun main(){
    val lIntarray = intArrayOf(1,3,5,6)
    val lSolution = Solution()
    lSolution.searchInsert(lIntarray,2)
}