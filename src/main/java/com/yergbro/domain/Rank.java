package com.yergbro.domain;

public class Rank {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.songListId
     *
     * @mbggenerated
     */
    private Long songlistid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.consumerId
     *
     * @mbggenerated
     */
    private Long consumerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.score
     *
     * @mbggenerated
     */
    private Integer score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.id
     *
     * @return the value of rank.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.id
     *
     * @param id the value for rank.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.songListId
     *
     * @return the value of rank.songListId
     *
     * @mbggenerated
     */
    public Long getSonglistid() {
        return songlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.songListId
     *
     * @param songlistid the value for rank.songListId
     *
     * @mbggenerated
     */
    public void setSonglistid(Long songlistid) {
        this.songlistid = songlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.consumerId
     *
     * @return the value of rank.consumerId
     *
     * @mbggenerated
     */
    public Long getConsumerid() {
        return consumerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.consumerId
     *
     * @param consumerid the value for rank.consumerId
     *
     * @mbggenerated
     */
    public void setConsumerid(Long consumerid) {
        this.consumerid = consumerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.score
     *
     * @return the value of rank.score
     *
     * @mbggenerated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.score
     *
     * @param score the value for rank.score
     *
     * @mbggenerated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "id=" + id +
                ", songlistid=" + songlistid +
                ", consumerid=" + consumerid +
                ", score=" + score +
                '}';
    }
}