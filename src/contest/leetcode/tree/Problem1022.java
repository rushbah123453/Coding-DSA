package contest.leetcode.tree;

public class Problem1022 {

    public int sumRootToLeaf(TreeNode root) {
        if(root==null)
            return 0;
        String str="";
        String res= helper(root,str);
        return Integer.parseInt(res);
    }
    public static String helper(TreeNode root,String str){
        if( root.left==null && root.right==null){
            int Decimal= binaryToDecimal(str+root.val);
            System.out.println("Binary= "+ str+root.val+" Decimal= "+Decimal);
            return String.valueOf(Decimal);
        }
        str=str+root.val;
        String left="0";
        String right="0";
        if(root.left!=null)
            left=helper(root.left,str);
        if(root.right!=null)
            right=helper(root.right,str);

        int leftplusright=Integer.parseInt(left)+Integer.parseInt(right);

        System.out.println("left+right"+leftplusright);
        return String.valueOf(leftplusright);
    }


    public static int binaryToDecimal(String str){
        int length=str.length()-1;
        char s[]=str.toCharArray();
        int res=0;
        for(int i=0;i<=length;i++){
            int power=(int) Math.pow(2,length-i);
            res=res+(Character.getNumericValue(s[i])*power);
        }return res;
    }

}
