package other_channels.First_testB;
//田野里的蔬菜排列成矩阵，他们的x和y坐标均是1-99的整数。
//求当三角形的三点坐标分别为（1.5，1.5）（1.5，6.8）（6.8，1.5）和
//（10.7，6.9）（8.5，1.5）（14.5，1.5）的时候统计该三角形内部(包括边界)共有多少个蔬菜？

//思路：此题为数学题。

//思路1：海伦公式，p=(a+b+c)/2,S=√p(p-a)(p-b)(p-c)

//思路2：三角形内的点，如p，那么有S△abc=S△abp+S△acp+S△bcp
//S△abc将一个点看作坐标原点，a(0,0),b(x1,y1),c(x2,y2)
//用向量表示三角形面积，最后带入坐标，得到公式S△abc=0.5*Math.abs(x2*y1-x1*y2)
//这里的数学推导不再展示

public class First_testB {
    public static void main(String[] args) {
        int count1=0;
        int count2=0;
        double ax1=1.5,ay1=1.5;
        double bx1=1.5,by1=6.8;
        double cx1=6.8,cy1=1.5;
        double ax2=10.7,ay2=6.9;
        double bx2=8.5,by2=1.5;
        double cx2=14.5,cy2=1.5;
        double triangleArea1=TriangleArea(ax1,ay1,bx1,by1,cx1,cy1);
        double triangleArea2=TriangleArea(ax2,ay2,bx2,by2,cx2,cy2);
        for(int x=1;x<100;x++){
            for(int y=1;y<100;y++){
                double area_abp1=TriangleArea(x,y,ax1,ay1, bx1,by1);
                double area_bcp1=TriangleArea(x,y,bx1,by1, cx1,cy1);
                double area_acp1=TriangleArea(x,y,ax1,ay1, cx1,cy1);
                double area_abp2=TriangleArea(x,y,ax2,ay2, bx2,by2);
                double area_bcp2=TriangleArea(x,y,bx2,by2, cx2,cy2);
                double area_acp2=TriangleArea(x,y,ax2,ay2, cx2,cy2);
                double area1=area_abp1+area_acp1+area_bcp1;
                double area2=area_abp2+area_acp2+area_bcp2;
                if(area1-triangleArea1<0.00000001){
                    count1++;
                }
                if(area2-triangleArea2<0.00000001){
                    count2++;
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }

    public static double TriangleArea(double p1,double p2,double x1,double y1,double x2, double y2){
        x1=x1-p1;
        y1=y1-p2;
        x2=x2-p1;
        y2=y2-p2;
        double area=0.5*Math.abs(x2*y1-x1*y2);
        return area;
    }
}
