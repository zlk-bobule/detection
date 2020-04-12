package com.nju.detection.domain;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

@Setter
@Getter
@NodeEntity(label = "nodeEdge")
public class NodeEdge {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PointNode startNode;

    @EndNode
    private PointNode endNode;

    private Integer calledNum;

}
