# edu-service

视频网站服务


### 集成Java上传SDK
    说明 本文以Java 1.8及以上版本、Java上传SDK 1.4.14版本举例说明集成步骤。其他版本请根据实际情况操作。如果集成遇到问题，请参见常见问题排查。
    下载Java上传SDK及示例代码。
    最新版本的下载地址请参见服务端上传SDK。历史版本下载请参见Java上传SDK发布历史。
    解压Java上传SDK及示例代码文件。
    以最新版本VODUploadDemo-java-1.4.14.zip为例，解压后的文件如下：
    lib：存放Java上传SDK所需要的jar包。
    sample：存放Java上传SDK的示例代码。
    引入Jar包。
    如果您在Eclipse环境集成：在Eclipse中右击您的工程，选择Properties > Java Build Path > Add JARs。找到解压后的VODUploadDemo-java-1.4.14文件，并将lib目录下的所有jar文件添加到您的项目中。
    如果您在IntelliJ IDEA集成：在IntelliJ IDEA中打开您的工程，选择File > Project Structure > Modules，单击右侧Dependencies，然后单击+，再单击JARs or directories。找到解压后的VODUploadDemo-java-1.4.14文件，并将lib目录下的所有jar文件添加到您的项目中。
    注意 引入Jar包后仍然需要配置依赖。
    添加阿里云Java SDK、OSS SDK、视频点播服务端SDK、视频点播服务端上传SDK等依赖。
    https://help.aliyun.com/document_detail/106648.htm?spm=a2c4g.11186623.0.0.767a1b78ZG2A6o#multiTask2011