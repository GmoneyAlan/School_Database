class Faculty{
    private boolean override;
    private int id;
    private boolean isPres;
    private String name;

    Faculty(boolean override, int id, boolean isPres, String name){
        this.override = override;
        this.id = id;
        this.isPres = isPres;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}