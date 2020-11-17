class Tree {
  private String treeName; 
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  public Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
  public Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
    this.treeName = aTreeName;
    this.treeType = aTreeType;
    this.leavesFall = aLeavesFall;
    this.leafColor = aLeafColor;
  }
  public void setName(String aTreeName){
    this.treeName = aTreeName;
    
  }
  public void setType(String aTreeType){
    this.treeType = aTreeType;
  }
  public void setFall(boolean aLeavesFall){
    this.leavesFall = aLeavesFall;
  }
  
  public void setColor(String aLeafColor){
    this.leafColor = aLeafColor;
  }

  public String getName(){
    return treeName;
  }
  public String getType(){
    return treeType;
  }
  public boolean getFall(){
    return leavesFall;
  }
  public String getColor(){
    return leafColor;
  }
  void print(){
    if(leavesFall){System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for the winter. ");}
      else{System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does not lose its leaves for the winter. ");}
  }
}