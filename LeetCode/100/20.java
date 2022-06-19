int size = s.length();
        List<Character> temp = new ArrayList<Character>();
        
        for(int i = 0; i < size; i++) {
            temp.add(s.charAt(i));
        }
        
        Collections.sort(temp);
        
        while(true) {
            if(temp.size() == 0) {
                // Successful exit
                return true;
            }
            if(temp.get(0) == '(') {
                for(int i = 1; i < temp.size(); i++) {
                    if(i == temp.size() - 1 && temp.get(i) != ')') {
                        return false;
                    }
                    if(temp.get(i) == ')') {
                        temp.remove(i);
                        temp.remove(0);
                        break;
                    }
                }
            } else if (temp.get(0) == '{') {
                for(int i = 1; i < temp.size(); i++) {
                    if(i == temp.size() - 1 && temp.get(i) != '}') {
                        return false;
                    }
                    if(temp.get(i) == '}') {
                        temp.remove(i);
                        temp.remove(0);
                        break;
                    }
                }
            } else if (temp.get(0) == '[') {
                for(int i = 1; i < temp.size(); i++) {
                    if(i == temp.size() - 1 && temp.get(i) != ']') {
                        return false;
                    }
                    if(temp.get(i) == ']') {
                        temp.remove(i);
                        temp.remove(0);
                        break;
                    }
                }
            }
        }