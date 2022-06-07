## 1.防止编译OOM 需要设置内存最大值

File->Settings->Build,Execution,Deployment->Complier   设置process heap size为1700

## 2.设置单步调试 

File->Settings->Build,Execution,Deployment->Debugger->Stepping  去除勾选 Do not step into the classes



## 3.关联JDK源码

File->Project Structure->Platform Settings->SDKs->Sourcepath   移除默认SDKs，然后添加入我们源码目录