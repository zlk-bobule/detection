package com.nju.detection.domain;

import com.nju.detection.enums.NodeModifier;
import com.nju.detection.enums.NodeType;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Setter
@Getter
@NodeEntity(label = "point")
public class PointNode {
    @Id
    @GeneratedValue
    private Long id;  //节点id:标识节点的唯 编号

    private String NodeName;  //节点名称:类或包名称

    private NodeType nodeType; //节点类型:取决于类或包是所分析项目的内部对象0还是从外部库检索的对象1

    private NodeModifier nodeModifier;  //一个类属性，指示类是抽象类还是接口

}
