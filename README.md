## Tech Study
1. Study1，[git和github的使用](https://github.com/imsizon/techstudy/wiki/study1---How-to-use-git-and-github)
1. Study2，[Java常见集合类数据结构及特点，Hash碰撞攻击及防范](https://github.com/imsizon/techstudy/wiki/Study2--Java-Collections-Data-Structure,-Hash-collision-dos)
1. Study3, [Classloader](https://github.com/imsizon/techstudy/wiki/Study3-ClassLoader)
  * xstream不同版本序列化case代码：`git clone https://github.com/imsizon/techstudy.git`
  * `cd techstudy/classloader-test`
  * `mvn exec:java`，输出内容应该如下：

```
[INFO] [exec:java {execution: default-cli}]
================Raw XmlObject=================
XmlObject [id=1688, name=test, description=class loader test]
================XmlObject to xml with xstream 1.4.1=================
<com.imsizon.classloader.test.XmlObject>
  <id>1688</id>
  <name>test</name>
  <description>class loader test</description>
</com.imsizon.classloader.test.XmlObject>
================Unmarshal XmlObject with xstream 1.4.1=================
XmlObject [id=1688, name=test, description=class loader test]
================XmlObject to xml with xstream 1.1.2=================
<com.imsizon.classloader.test.XmlObject>
  <id>1688</id>
  <name>test</name>
  <description serialization="custom">
    <java.lang.StringBuilder>
      <default/>
      <int>17</int>
      <char-array>class loader test</char-array>
    </java.lang.StringBuilder>
  </description>
</com.imsizon.classloader.test.XmlObject>
================Unmarshal XmlObject with xstream 1.1.2=================
XmlObject [id=1688, name=test, description=class loader test]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
```
