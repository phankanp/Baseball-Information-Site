package com.spring.mlbstats.model.PlayerDetail.SeasonHittingStats;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created",
        "totalSize",
        "row"
})
public class SeasonHittingStatsQueryResults {

    @JsonProperty("created")
    private String created;
    @JsonProperty("totalSize")
    private String totalSize;
    @JsonProperty("row")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<SeasonHittingStatsRow> row;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("totalSize")
    public String getTotalSize() {
        return totalSize;
    }

    @JsonProperty("totalSize")
    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    @JsonProperty("row")
    public List<SeasonHittingStatsRow> getRow() {
        return row;
    }

    @JsonProperty("row")
    public void setRow(List<SeasonHittingStatsRow> row) {
        this.row = row;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
