'''
class ParseTreeVisitor(object):
    def visit(self, tree):
        return tree.accept(self)

    def visitChildren(self, node):
        result = self.defaultResult()
        n = node.getChildCount()
        for i in range(n):
            if not self.shouldVisitNextChild(node, result):
                return result

            c = node.getChild(i)
            childResult = c.accept(self)
            result = self.aggregateResult(result, childResult)

        return result

    def visitTerminal(self, node):
        return self.defaultResult()

    def visitErrorNode(self, node):
        return self.defaultResult()

    def defaultResult(self):
        return None

    def aggregateResult(self, aggregate, nextResult):
        return nextResult

    def shouldVisitNextChild(self, node, currentResult):
        return True

ParserRuleContext = None
'''

from antlr4 import *

class AppParseTreeVisitor(ParseTreeVisitor):
    '''
    https://github.com/datacamp/antlr-ast/blob/master/antlr_ast/ast.py
    '''

    def visit(self, tree):
        return tree.accept(self)

    def visitChildren(self, node):
        result = self.defaultResult()
        n = node.getChildCount()
        for i in range(n):
            if not self.shouldVisitNextChild(node, result):
                return result

            c = node.getChild(i)
            childResult = c.accept(self)
            result = self.aggregateResult(result, childResult)

        return result

    def visitTerminal(self, node):
        return self.defaultResult()

    def visitErrorNode(self, node):
        return self.defaultResult()

    def defaultResult(self):
        return None

    def aggregateResult(self, aggregate, nextResult):
        return nextResult

    def shouldVisitNextChild(self, node, currentResult):
        return True
    
    def getNrOfChildren(self, node):
        if node is None or node.children is None:
            return None
        return len(node.children)
    
    def getNodesChild(self, node, idx: int):
        if node is None:
            return None

        if idx < 0 or idx >= len(node.children):
            return None

        return node.children[idx]
    
    def visitChild(self, node, idx: int):

        if node is None:
            return None

        if idx < 0 or idx >= len(node.children):
            return None
        c = node.getChild(idx)
        childResult = c.accept(self)
        return self.aggregateResult(self.defaultResult(), childResult)

ParserRuleContext = None