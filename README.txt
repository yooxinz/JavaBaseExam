//编译
mvn clean compile

//运行Exam1
计算101-200之间的素数
mvn exec:java -Dexec.mainClass="com.hand.zyx.Exam1"

//运行Exam2
用户输入工资,计算所需缴纳的税费
mvn exec:java -Dexec.mainClass="com.hand.zyx.Exam2"

//运行Exam3
用户输入日期,计算所处当年第几天
mvn exec:java -Dexec.mainClass="com.hand.zyx.Exam3"

//运行Exam4
随机生成50个小于100的数,对其进行分类并排序
mvn exec:java -Dexec.mainClass="com.hand.zyx.Exam4"
